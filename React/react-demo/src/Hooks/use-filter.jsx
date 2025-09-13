import { useEffect, useState } from "react";

export function useFilter(collection, searchString) {
    const [filters, setFilters] = useState([]);

    useEffect(() => {
        if (!Array.isArray(collection)) return;

        setFilters(
            collection.filter(item =>
                String(item).toLowerCase().includes(searchString.toLowerCase())
            )
        );
    }, [collection, searchString]);

    return filters;
}
