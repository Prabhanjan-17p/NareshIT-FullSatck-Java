import React from "react";

// PureComponents -> it load only the changes 
// Components -> it load full the component if any changes in components 
// export class DemoComponent extends React.Component{
export class DemoClassComponent extends React.PureComponent{
    constructor(){
        super();
        this.state = {
            categories : ["All","Electronics","Fashion"],
            title : "Categoeries List",
            styleobj : {border:"2px double red", textAlign:"center", padding:"5px", margin:"20px"},
            theme: 'bg-danger  text-white'
        }
    }

    componentDidMount(){
        this.setState({
            title: "Select a category",
            theme: "bg-primary text-white"
        })
    }

    render(){
        return(
            <div className="container-fluid">
                <h2 className={this.state.theme} style={this.state.styleobj}>{this.state.title}</h2>
                <select name="" id="">
                    {
                        this.state.categories.map(category => <option key={category}>{category}</option>)
                    }
                </select>
            </div>
        )
    }
}