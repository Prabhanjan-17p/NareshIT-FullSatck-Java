import React from "react";


export class DataCard extends React.Component{

    constructor(){
        super();
    }

    render(){
        return(
            <div className="card p-2" style={{width:"200px"}}>
                <div className="card-title text-center h-3 bg-danger">
                    {
                        this.props.cardTitle
                    }
                </div>
                <div className="card-body">
                    <ol>
                        {
                            this.props.items.map(item => <li key={item}>{item}</li>)
                        }
                    </ol>
                </div>
            </div>
        )
    }
}