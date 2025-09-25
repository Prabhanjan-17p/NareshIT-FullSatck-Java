import React from "react";

export class DirectEventHandler extends React.PureComponent{
    constructor(){
        super();
        this.state = {
            msg : ""
        }
    }

    componentDidMount(){
        this.setState({
            title: "Select a category",
            theme: "bg-primary text-white"
        })
    }

    handleInsertClick(){
        this.setState({msg: "Record Insert Successfully."})
    }

    handleDeleteClick(){
        this.setState({msg: "Delete Successfully."})
    }

    render(){
        return(
            <div className="container-fluid mt-3">
                <button onClick={this.handleInsertClick.bind(this)} className="btn btn-primary">Insert</button>
                <button onClick={this.handleDeleteClick.bind(this)} className="btn btn-danger ms-3">Delete</button>
                <p>{this.state.msg}</p>
            </div>
        )
    }
}