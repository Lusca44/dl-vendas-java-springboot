import Datatable from "components/datatable";
import Footer from "components/footer";
import NavBar from "components/navBar";
import React from "react";

function App() {
	return (
		<>
			<NavBar />
			<div className="container">
				<h1 className="text-primary">Hello World</h1>
				<Datatable />
			</div>
			<Footer />
		</>
	);
}

export default App;
