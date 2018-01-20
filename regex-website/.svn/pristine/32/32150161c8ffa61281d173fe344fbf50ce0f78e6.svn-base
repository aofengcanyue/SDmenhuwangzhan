$(function(){
	$(".nav_info > li > a").click(function(){
		var oIndex = $(this).parent().index()
		$(this).addClass("active").parent().siblings().find("a").removeClass("active");
		$(".tt_nav_content>div").eq(oIndex).show().siblings().hide()
	})
	
	$(".busi_nav li").click(function(){
		$(this).addClass("current").siblings().removeClass("current");
		$(".busi_nav_content>div").eq($(this).index()).show().siblings().hide()
		
	})
	
	$(".busi_nav1 li").click(function(){
		$(this).addClass("current").siblings().removeClass("current");
		
		$(".busi_nav_content1>div").eq($(this).index()).show().siblings().hide()
		
	})
	
	$(".res_list_ul li").click(function(){
		$(this).addClass("curr").siblings().removeClass("curr");
		$(".res_list_content>div").eq($(this).index()).show().siblings().hide()
	})
	
})
