<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<title>Cadastro</title>
</head>
<body>

	<div class="container-fluid">
			<div class="row">		
				<div class ="col-xs-12 col-sm-6 col-md-8 col-lg-10 col-md-offset-1">		
					<div class="panel panel-default">
						<div class="panel-heading">
							<h1>Cadastrar Contato</h1>
						</div>
					</div>
					
					<div class="panel-body">
						<form id="cadastro-contato" class="form-horizontal" action="/cadastrar" method="post">
							<input type="hidden" name="contato.id" />
						
							<div class="form-group">
								<label class="control-label" for="contato.nome">Nome:</label>
								<input type="text" id="nome" class="form-control" name="contato.nome" placeholder="Nome">
							</div>
							
							<div class="form-group">
								<label class="control-label" for="contato.apelido">Apelido:</label>
								<input type="text" id="apelido" class="form-control" name="contato.apelido" placeholder="Apelido">
							</div>
							
							<div class="form-group">
								<label class="control-label" for="contato.telefone">Telefone:</label>
								<input type="text" id="telefone" class="form-control" name="contato.telefone" placeholder="Telefone">
							</div>
							
							<div class="form-group">
								<label class="control-label" for="contato.celular">Celular:</label>
								<input type="text" id="celular" class="form-control" name="contato.celular" placeholder="Celular">
							</div>
							
							<div class="form-group">
								<label class="control-label" for="contato.email">Email:</label>
								<input type="text" id="email" class="form-control" name="contato.email" placeholder="Email">
							</div>
							
							<div class="form-group">
								<label class="control-label" for="contato.dt-nasc">Data Nascimento:</label>
								<input type="text" id="dt-nasc" class="form-control" name="contato.dt-nasct" placeholder="Data nascimento">
							</div>
							
														
							<div class="form-group"><input type="submit" id="login-submit" value="Cadastrar" class="btn btn-success btn-lg"/></div>	
						</form>
					</div>					
				</div>
			</div>
		</div>

</body>
</html>