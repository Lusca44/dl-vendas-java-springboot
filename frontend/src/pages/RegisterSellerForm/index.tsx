import Button from "components/button";
import Footer from "components/footer";
import NavBar from "components/navBar";
import { useState } from "react";

function RegisterSellerForm() {
	const [name, setName] = useState("");

	return (
		<>
			<NavBar />
			<div className="container d-flex justify-content-center">
				<div className="jumbotron">
					<h1 className="display-4">Cadastro de vendedor</h1>

					<form method="POST" className="w-100 ">
						<div className="mb-3">
							<label className="form-label">Nome do vendedor</label>
							<input
								type="text"
								className="form-control"
								id="name"
								name="name"
								placeholder="Ex.: Pedro"
								value={name}
								onChange={e => setName(e.target.value)}
							/>
						</div>
						<Button value="salvar" name={name} />
					</form>
				</div>
			</div>
			<Footer />
		</>
	);
}

export default RegisterSellerForm;
