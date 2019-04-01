<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script>
	var left = {
		pageSubmitFn : function(menu) {
			
			$("#frm").attr("action", menu + ".do");
			$("#pageName").val(menu);
			if ( menu === "iceAmericano") {
				$("#country").val("러시아");
			} else if ( menu === "legoKeyRing" ) {
				$("#age").val(12);
			} else if ( menu === "nikeVaporMax" ) {
				$("#etc").val("아자!");
			} else if ( menu === "icis" ) {
				$("#seqNo").val("3");
			} else if ( menu === "sheetMusicBest" ) {
				$("userName").val("뿌꾸뿌꾸");
			} else if ( menu === "seikoAlba" ) {
				$("age").val(15);
			} else if ( menu === "huawei" ) {
				$("etc").val("아자!");
			} else if ( menu === "xiaom" ) {
				$("country").val("러시아");
			} else if ( menu === "michaelKors" ) {
				$("country").val("이태리");
			} else if ( menu === "balenciaga" ) {
				$("userName").val("한큐");
			}
			
			$("#frm").submit();
		}		
	};
	
	$(function() {
		 var pageName = "<c:out value="${param.pageName}"/>";
		 
		$(".menu").removeClass("active");
		$("#" + pageName).addClass("active");
		
		$(".menu").click(function() {
			var menu = $(this).attr("id");
			
			left.pageSubmitFn(menu);
		});
	});
</script>

<form id="frm">
	<input type="hidden" id="pageName" 	name="pageName"/>
	<input type="hidden" id="seqNo" 	name="seqNo" 	value=""/>
	<input type="hidden" id="country" 	name="country" 	value=""/>
	<input type="hidden" id="etc" 		name="etc" 		value=""/>
	<input type="hidden" id="userName" 	name="userName" value=""/>
	<input type="hidden" id="age" 		name="age" 		value=""/>
</form>

<div class="sidebar" data-color="orange" data-image="img/full-screen-image-3.jpg">
     <!--

         Tip 1: you can change the color of the sidebar using: data-color="blue | azure | green | orange | red | purple"
         Tip 2: you can also add an image using data-image tag

     -->

    <div class="logo">
        <a href="http://www.creative-tim.com" class="logo-text">
            Creative Tim
        </a>
    </div>
	<div class="logo logo-mini">
		<a href="http://www.creative-tim.com" class="logo-text">
			Ct
		</a>
	</div>

   	<div class="sidebar-wrapper">
           <div class="user">
               <div class="photo">
                   <img src="img/default-avatar.png" />
               </div>
               <div class="info">
                   <a data-toggle="collapse" href="#collapseExample" class="collapsed">
                       Tania Andrew
                       <b class="caret"></b>
                   </a>
                   <div class="collapse" id="collapseExample">
                       <ul class="nav">
                           <li><a href="#">My Profile</a></li>
                           <li><a href="#">Edit Profile</a></li>
                           <li><a href="#">Settings</a></li>
                       </ul>
                   </div>
               </div>
           </div>

           <ul class="nav">
               <li id="main" class="menu active">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>Dashboard</p>
                   </a>
               </li>
               <li id="welcomeWeb" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>welcomeWeb</p>
                   </a>
               </li>
               <li id="onTheDesk" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>onTheDesk</p>
                   </a>
               </li>
               <li id="zaigen" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>zaigen</p>
                   </a>
               </li>
               <li id="penzi" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>penzi</p>
                   </a>
               </li>
               <li id="sonySpeaker" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>sonySpeaker</p>
                   </a>
               </li>
                <li id="ikeaLamp" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>ikeaLamp</p>
                   </a>
               </li>
               <li id="jetStream" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>jetStream</p>
                   </a>
               </li>
               <li id="nashvilleCast" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>nashvilleCast</p>
                   </a>
               </li>
               <li id="tuscani" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>tuscani</p>
                   </a>
               </li> 
               <li id="smileAgain" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>smileAgain</p>
                   </a>
               </li> 
               <li id="salesMan" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>salesMan</p>
                   </a>
               </li>
               <li id="salesMan" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>salesMan</p>
                   </a>
               </li>
               <li id="iceAmericano" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>iceAmericano</p>
                   </a>
               </li> 
               <li id="legoKeyRing" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>legoKeyRing</p>
                   </a>
               </li>
               <li id="nikeVaporMax" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>nikeVaporMax</p>
                   </a>
               </li>
               <li id="icis" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>icis</p>
                   </a>
               </li>
               <li id="sheetMusicBest" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>sheetMusicBest</p>
                   </a>
               </li>
               <li id="sheetMusicBest" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>sheetMusicBest</p>
                   </a>
               </li>
               <li id="seikoAlba" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>seikoAlba</p>
                   </a>
               </li>
               <li id="xiaom" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>xiaom</p>
                   </a>
               </li> 
               <li id="huawei" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>huawei</p>
                   </a>
               </li> 
               <li id="michaelKors" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>michaelKors</p>
                   </a>
               </li> 
               <li id="balenciaga" class="menu">
                   <a href="#">
                       <i class="pe-7s-graph"></i>
                       <p>balenciaga</p>
                   </a>
               </li>   
           </ul>
   	</div>
</div>
