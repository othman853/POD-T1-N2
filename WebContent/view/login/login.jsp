<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

</head>
<body>

<div class="container-fluid">
			<div class="row">		
				<div class ="col-xs-12 col-sm-6 col-md-8 col-lg-10 col-md-offset-1">		
					<div class="panel panel-default">
						<div class="panel-heading">
							<h1>Login</h1>
						</div>
					</div>
					
					<div class="panel-body">
						<form id="login-usuario" class="form-horizontal" action="login" method="post">
							<input type="hidden" name="user.id" />
						
							<div class="form-group">
								<label class="control-label" for="user.login">Login:</label>
								<input type="text" id="usuario" class="form-control" name="user.login" placeholder="Digite seu usuário">
							</div>
							
							<div class="form-group">
								<label class="control-label" for="user.password">Senha:</label>
								<input type="password" id="senha" class="form-control" name="user.password" placeholder="Digite sua senha">
							</div>	
														
							<div class="form-group"><input type="submit" id="login-submit" value="Cadastrar" class="btn btn-success btn-lg"/></div>	
						</form>
					</div>					
				</div>
			</div>
		</div>

</body>
</html>