package com.regex.web.service.email;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.mail.internet.MimeMessage;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

/**
 * 纯文本邮件服务类.
 * 
 * @author ocean
 */
public class SimpleMailService {
	private static Logger logger = LoggerFactory.getLogger(SimpleMailService.class);

	private JavaMailSender mailSender;

	private static final String DEFAULT_ENCODING = "utf-8";

	private String textTemplate;

	/**
	 * 发送纯文本的用户修改通知邮件.
	 */
	public void sendNotificationMail(String userName) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom("1.demo@gmail.com");
		msg.setTo("2.demo@gmail.com");
		msg.setSubject("用户修改通知");

		// 将用户名与当期日期格式化到邮件内容的字符串模板
		String content = String.format(textTemplate, userName, new Date());
		msg.setText(content);

		try {
			mailSender.send(msg);
			if (logger.isInfoEnabled()) {
				logger.info("纯文本邮件已发送至{}", StringUtils.join(msg.getTo(), ","));
			}
		} catch (Exception e) {
			logger.error("发送邮件失败", e);
		}
	}

	/**
	 * 发送纯文本的用户通知邮件.
	 */
	public void sendNotificationMail(String from, String[] to, String content, String subject) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom(from);
		msg.setTo(to);
		msg.setSubject(subject);
		msg.setText(content);
		try {
			mailSender.send(msg);
			if (logger.isInfoEnabled()) {
				logger.info("纯文本邮件已发送至{}", StringUtils.join(msg.getTo(), ","));
			}
		} catch (Exception e) {
			logger.error("发送邮件失败", e);
			for(String t : to){
				logger.error(t+"发送失败");
			}			
		}
	}

	/**
	 * 发送MIME格式的用户通知邮件.
	 */
	public void sendNotificationMail(String from, String[] to, String content, String subject, HashMap<String, File> fileMap) {
		try {
			MimeMessage msg = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(msg, true, DEFAULT_ENCODING);
			helper.setFrom(from);
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(content, true);
			Iterator<Entry<String, File>> iter = fileMap.entrySet().iterator();
			while (iter.hasNext()) {
				Map.Entry<String, File> entry = (Map.Entry<String, File>) iter.next();
				helper.addAttachment(entry.getKey(), entry.getValue());
			}
			mailSender.send(msg);
			if (logger.isInfoEnabled()) {
				logger.info("MIME邮件已发送至{}", StringUtils.join(to, ","));
			}
		} catch (Exception e) {
			logger.error("发送邮件失败", e);
		}
	}

	/**
	 * Spring的MailSender.
	 */
	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	/**
	 * 邮件内容的字符串模板.
	 */
	public void setTextTemplate(String textTemplate) {
		this.textTemplate = textTemplate;
	}
}
