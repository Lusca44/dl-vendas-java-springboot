import axios from "axios";
import { Link } from "react-router-dom";
import { BASE_URL } from "utils/requests";

type Props = {
	name: string;
	value: string;
};

function Button({ name, value }: Props) {
	function handleSubmit() {
		const seller = {
			name: name
		};
		axios.post(`${BASE_URL}/sellers/cadastro`, seller);
	}

	function handleRedirect() {
		console.log("Criado");
	}

	return (
		<>
			<div className="">
				<Link to="/">
					<button
						type="button"
						className="btn btn-primary btn-lg"
						onClick={() => {
							handleSubmit();
							handleRedirect();
						}}
					>
						{value}
					</button>
				</Link>
			</div>
		</>
	);
}

export default Button;
