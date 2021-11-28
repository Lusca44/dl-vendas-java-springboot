import Dashboard from "pages/Dashboard";
import Home from "pages/Home";
import RegisterSellerForm from "pages/RegisterSellerForm";
import { BrowserRouter, Switch, Route } from "react-router-dom";

function Routes() {
	return (
		<BrowserRouter>
			<Switch>
				<Route path="/" exact>
					<Home />
				</Route>
				<Route path="/dashboard">
					<Dashboard />
				</Route>
				<Route path="/registerSeller">
					<RegisterSellerForm />
				</Route>
			</Switch>
		</BrowserRouter>
	);
}

export default Routes;
