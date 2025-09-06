


export function DataGrid(props) {


    return (
        <table className={`table table-hover fs-5 ${props.them}`}>
            <caption>{props.capation}</caption>
            <thead >
                <tr>
                    {
                        props.fields.map(field =>
                            <th key={field}>
                                <div className="d-flex justify-content-between">
                                    <span>{field.toUpperCase()}</span>
                                    <span> <button className="bi bi-three-dots-vertical btn btn-primary"></button></span>
                                </div>
                            </th>)
                    }
                </tr>
            </thead>
            <tbody>
                {
                    props.data.map(record =>
                        <tr key={record}>
                            {
                                Object.keys(record).map(field => <td>{record[field]}</td>)
                            }
                        </tr>
                    )
                }
            </tbody>
            <tfoot>
                <tr>
                    <td colSpan={props.fields.length} className="text-center">copyright 2024</td>
                </tr>
            </tfoot>
        </table>
    )
}