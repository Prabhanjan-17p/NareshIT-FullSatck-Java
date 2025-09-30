import { DatePicker } from '@mui/x-date-pickers/DatePicker';
import { useState } from 'react';


export function DatePickerTime() {

    const [fetchDate, setFetchDate] = useState(null);

  function handleOnChangeDate(newValue) {
    setFetchDate(newValue);
    console.log("Selected Date:", newValue ? newValue.format("YYYY-MM-DD") : null);
  }
    return (
        <div className='container-fluid mt-3'>
            <h3>Depature</h3>
            <DatePicker value={fetchDate} onChange={handleOnChangeDate} />
        </div>
    )
}