<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<html lang="en">
<head>
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
 <!-- Bootstrap Core CSS -->
<link href="model/css/bootstrap.min.css" rel='stylesheet' type='text/css'/>
<!-- Custom CSS -->
<link href="model/css/style.css" rel='stylesheet' type='text/css'/>
<!-- Graph CSS -->
<link href="model/css/font-awesome.css" rel="stylesheet"> 
<!-- jQuery -->
<link href='https://fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400' rel='stylesheet' type='text/css'>
<!-- lined-icons -->
<link rel="stylesheet" href="model/css/icon-font.min.css" type='text/css' />
<!-- //lined-icons -->
<script src="model/js/jquery-1.10.2.min.js"></script>
<!--clock init-->
</head> 
<body>
								<!--/login-->
								
									   <div class="error_page">
												<!--/login-top-->
												
													<div class="error-top">
													<h2 class="inner-tittle page">Augment</h2>
													    <div class="login">
														<h3 class="inner-tittle t-inner">Login</h3>
																<div class="buttons login">
																			<ul>
																				<li><a href="#" class="hvr-sweep-to-right">Facebook</a></li>
																				<li class="lost"><a href="#" class="hvr-sweep-to-left">Twitter</a> </li>
																				<div class="clearfix"></div>
																			</ul>
																		</div>
																<form method="post" action="login">
																		<input type="text" class="text" name="username" value="name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'E-mail address';}" >
																		<input type="password" name="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">
																		<div class="submit"><input type="submit" onclick="myFunction()" value="Login" ></div>
																		<div class="clearfix"></div>
																		
																		<div class="new">
																			<p><label class="checkbox11"><input type="checkbox" name="checkbox"><i> </i>Forgot Password ?</label></p>
																			<p class="sign">Do not have an account ? <a href="sign.html">Sign Up</a></p>
																			<div class="clearfix"></div>
																		</div>
																	</form>
														</div>

														
													</div>
													
													
												<!--//login-top-->
										   </div>
						
										  	<!--//login-->
										    <!--footer section start-->
										<div class="footer">
												<div class="error-btn">
															<a class="read fourth" href="index.html">Return to Home</a>
															</div>
										</div>
									<!--footer section end-->
									<!--/404-->
<!--js -->
<script src="model/js/jquery.nicescroll.js"></script>
<script src="model/js/scripts.js"></script>
<!-- Bootstrap Core JavaScript -->
   <script src="model/js/bootstrap.min.js"></script>
</body>
</html>