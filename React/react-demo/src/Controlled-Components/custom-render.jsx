


export function CustomDataGrid(props) {

    if (props.layout === 'Grid') {
        return (
            <table className={`table table-hover mt-4 fs-5 ${props.them}`}>
                <caption>{props.capation}</caption>
                <thead >
                    <tr>
                        {
                            props.fields.map(field =>
                                <th key={field}>
                                    <div className="d-flex justify-content-between">
                                        <span>{field.toUpperCase()}</span>
                                        <span>
                                            <div class="dropdown">
                                                <button class="bi bi-three-dots-vertical btn btn-primary " type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                </button>
                                                <div className="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                                    <a className="dropdown-item" href="#">Sorting Ascending <span className="bi bi-sort-up"></span></a>
                                                    <a className="dropdown-item" href="#">Sorting Descending <span className="bi bi-sort-down"></span></a>
                                                </div>
                                            </div>
                                        </span>
                                    </div>
                                </th>)
                        }
                        <th className="text-center">
                            ACTION
                        </th>
                    </tr>

                </thead>
                <tbody>
                    {
                        props.data.map(record =>
                            <tr key={record}>
                                {
                                    Object.keys(record).map(field => <td>{record[field]}</td>)
                                }
                                <td className="text-center">
                                    <button className="bi bi-pen-fill btn btn-warning"></button>
                                    <button className="bi bi-trash btn btn-danger ms-2"></button>
                                </td>
                            </tr>
                        )
                    }
                </tbody>
                <tfoot>
                    <tr>
                        <td colSpan={props.fields.length+1} className="text-center">copyright 2024</td>
                    </tr>
                </tfoot>
            </table>
        )
    }else if(props.layout === 'Card'){
        return(
            <div className="d-flex mt-4">
                {
                    props.data.map(record =>
                        <div key={record} className="card m-2 p-2 ">
                            <div className="card-header">
                                {
                                    record[Object.keys(record)[0]]
                                }
                            </div>
                            <div className="card-body">
                                {
                                    record[Object.keys(record)[1]]
                                }
                            </div>
                        </div>
                    )
                }
            </div>
        )
    }
}