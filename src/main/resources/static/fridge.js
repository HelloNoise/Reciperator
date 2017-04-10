class FridgeTable extends React.Component {
		constructor(props) {
        	super(props);
			this.deleteFridge = this.deleteFridge.bind(this);
			//this.searchRecipes = this.searchRecipes.bind(this);
		}

		deleteFridge(fridge) {
			this.props.deleteFridge(fridge);
		}

		/*searchRecipes(fridge) {
			this.props.searchRecipes(fridge);
		}*/

 		 render() {
   			var rows = this.props.fridges.map(fridge =>
        		<Fridge fridge={fridge} deleteFridge={this.deleteFridge} /*searchRecipes={this.searchRecipes}*//>
    		);

    		return (
			<div>
      			<table className="table table-bordered">
        			<thead>
          				<tr>
            				<th>Fridge name</th>
            				<th>Ingredients</th>
          				</tr>
        			</thead>
        			<tbody>{rows}</tbody>
      			</table>
			</div>
    		);
  		}
	}

class Fridge extends React.Component {
		constructor(props) {
			super(props);
			this.deleteFridge = this.deleteFridge.bind(this);
			//this.searchRecipes = this.searchRecipes.bind(this);
		}

		deleteFridge() {
			this.props.deleteFridge(this.props.fridge);
		}

		/*searchRecipes() {
			this.props.searchRecipes(this.props.fridge);
		}*/

		render() {

    		return (
		      <tr>
        		<td>{this.props.fridge.fridgeName}</td>
        		<td>{this.props.fridge.ingredients}</td>
				//<td><button className="btn btn-warning" onClick={this.searchRecipes}>Search</button></td>
				<td><button className="btn btn-default" onClick={this.deleteFridge}>Remove</button></td>
      		</tr>
  			);
		}
	}
class FridgeForm extends React.Component {
    constructor(props) {
        super(props);
        this.state = {fridgeName: '', ingredients: []};
        this.handleSubmit = this.handleSubmit.bind(this);
        this.handleChange = this.handleChange.bind(this);
    }

    handleChange(event) {
			const target = event.target;
    		const value = target.type === 'checkbox' ? target.checked : target.value;
    		var name = target.name;

    		this.setState({
      			[name]: value
    		});
  		}

    handleSubmit(event) {
		var ingredients = [this.state.ingredient1, this.state.ingredient2, this.state.ingredient3, this.state.ingredient4, this.state.ingredient5,];
		var fridge = {fridgeName: this.state.fridgeName, ingredients};
		this.props.createFridge(fridge);

    }

    render() {
        return (
            <div className="panel panel-default">
                <div className="panel-heading">Create your own fridge!</div>
                <div className="panel-body">
                <form className="form-inline">
                    <div className="col-md-2">
                        <input type="text" placeholder="Name your fridge" className="form-control"  name="fridgeName" onChange={this.handleChange}/>
                    </div>
                    <div className="col-md-2">
                        <input type="text" placeholder="Ingredient1" className="form-control" name="ingredient1" onChange={this.handleChange}/>
                    </div>
                    <div className="col-md-2">
                        <input type="text" placeholder="Ingredient2" className="form-control" name="ingredient2" onChange={this.handleChange}/>
                    </div>
					 <div className="col-md-2">
                        <input type="text" placeholder="Ingredient3" className="form-control" name="ingredient3" onChange={this.handleChange}/>
                    </div>
 					<div className="col-md-2">
                        <input type="text" placeholder="Ingredient4" className="form-control" name="ingredient4" onChange={this.handleChange}/>
                    </div>
 					<div className="col-md-2">
                        <input type="text" placeholder="Ingredient5" className="form-control" name="ingredient5" onChange={this.handleChange}/>
                    </div>
                    <div className="col-md-2">
                        <button className="btn btn-danger" onClick={this.handleSubmit}>Save</button>
                    </div>
                </form>
                </div>
            </div>
        );
    }
}

module.exports = FridgeTable;
module.exports = Fridge;
module.exports = FridgeForm;
