import React from "react";

export class ReturnAContinuousMemory extends React.PureComponent{
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
                <button onClick={() => this.handleInsertClick()} className="btn btn-primary">Insert</button>
                <button onClick={() => this.handleDeleteClick()} className="btn btn-danger ms-3">Delete</button>
                <p>{this.state.msg}</p>
            </div>
        )
    }
}