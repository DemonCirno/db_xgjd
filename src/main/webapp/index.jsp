<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>报名表</title>
</head>
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<body >
	<div class="container-fluid" style="padding: 40px;">
	<div class="row-fluid">
		<div class="span12">
		<div >
		
		<h4><font color="red" >
		${key}
		</font>
		</h4>

			<form role="form" class="form-horizontal" action="/db_xgjd/memberController/insertMember.do" method="post">
			
				<div class="form-group">
					 <label for="name">姓名：</label><input class="form-control" id="name" type="text"name="membername" />
					 
				</div>
				<div class="form-group">
					 <label for="name">性别：</label>
					 <input name="membersex" value="0" type="radio"/>男
					 <input name="membersex" value="1" type="radio"/>女
				</div>
				<div class="form-group">
					 <label for="name">学号：</label><input class="form-control" id="name" type="text"name="memebrstuid" />
					 
				</div>
				<div class="form-group">
					 <label for="name">班级：</label><input class="form-control" id="name" type="text"name="memberclass" />
					 
				</div>
				<div class="form-group">
					 <label for="name">报考科目：</label><input class="form-control" id="name" type="text"name="subjects" />
					 
				</div>
				<div class="form-group">
					 <label for="name">联系方式：</label><input class="form-control" id="name" type="text"name="contactway" />
				
				</div>
				<button type="submit" class="btn btn-default">提交</button>
				<button type="reset" class="btn btn-default">重置</button>
				
				<!-- ID：<input name="employeeID" type="text"/>
				姓名：<input name="employeeName" type="text"/>
				性别：
				<input name="employeeSex" value="male" type="radio"/>男
				<input name="employeeSex" value="female" type="radio"/>女
				生日：<input name="employeeBirth" type="text"/>
				手机：<input name="employeePhone" type="text"/>
				地址：<input name="employeePlace" type="text"/>
				加入时间：<input name="joinTime" type="text"/>
				系统口令：<input name="password" type="text"/>
				管理员：
				<input name="islead" value="male" type="radio"/>是
				<input name="islead" value="female" type="radio"/>不是 -->
			

			</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>