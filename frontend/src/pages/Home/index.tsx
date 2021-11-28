import Footer from "components/footer";
import NavBar from "components/navBar";
import { Link } from "react-router-dom";

function Home() {
	return (
		<>
			<NavBar />
			<div className="container">
				<div className="jumbotron">
					<h1 className="display-4">DSVendas</h1>
					<p className="lead">
						Analise o desempenho das suas vendas por diferentes perspectivas
					</p>
					<hr />
					<p>
						Esta aplicação consiste em exibir um dashboard a partir de dados
						fornecidos por um back end construído com Spring Boot.
					</p>
					<div className="row justify-content-center">
						<div className="col-3">
							<Link className="btn btn-primary btn-lg" to="/dashboard">
								Acessar Dashboard
							</Link>
						</div>
						<div className="col-3">
							<Link className="btn btn-primary btn-lg" to="/registerSeller">
								Registrar novo vendedor
							</Link>
						</div>
					</div>
				</div>
			</div>
			<Footer />
		</>
	);
}

export default Home;
