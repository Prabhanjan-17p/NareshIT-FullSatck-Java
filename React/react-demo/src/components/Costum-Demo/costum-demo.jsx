import { DataGrid } from "../../Controlled-Components/data-grid"

export function CustomDemo() {
    

    return(
        <div className="container-fluid table">
            <h2>Employees</h2>
            <DataGrid them='table-dark' capation="Employee Details - Update on Dec 2024" fields={['First Name','Last Name','Designation']} data={[{FirstName:'Kanha',LastName:'Amanta', Designation:'Full Satck Devloper'},{FirstName:'Pravanjan',LastName:'Biswal', Designation:'Manger'} ]} footer="copyright 2024"  />

            <h2>Products</h2>
            <DataGrid  them="table-peimary" capation="Product Details - Updates on Jan 2025" fields={['Name', 'Price', 'Stock', 'Rating']} data={[{Name:'Realme TV', Price:23000, Stock:"Available", Rating:4.3}]} footer="copyright 2025"  />
        </div>
    )
}