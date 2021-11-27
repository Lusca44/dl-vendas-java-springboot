import BarChart from "components/barChart";
import Datatable from "components/datatable";
import DonutChart from "components/donutChart";
import Footer from "components/footer";
import NavBar from "components/navBar";

function Dashboard() {
	return (
		<>
			<NavBar />
			<div className="container">
				<h1 className="text-center text-primary py-3">Dashboard de vendas</h1>

				<div className="row px-3">
					<div className="col-sm-6">
						<h5 className="text-center text-secondary">Taxa de sucesso</h5>
						<BarChart />
					</div>
					<div className="col-sm-6">
						<h5 className="text-center text-secondary">Todas as vendas</h5>
						<DonutChart />
					</div>
				</div>

				<div className="py-3">
					<h2 className="text-primary">Todas vendas</h2>
				</div>
				<Datatable />
			</div>
			<Footer />
		</>
	);
}

export default Dashboard;
