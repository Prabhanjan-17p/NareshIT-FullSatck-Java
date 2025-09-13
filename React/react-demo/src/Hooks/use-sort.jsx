import { useEffect, useState } from "react";

export function useSort(collection, reverse) {
    const [sort, setSort] = useState([]);

    useEffect(() => {
        if (!Array.isArray(collection)) return;

        let sorted = [...collection].sort((a, b) => {
            if (a > b) return 1;
            if (a < b) return -1;
            return 0;
        });

        setSort(reverse ? sorted.reverse() : sorted);
    }, [collection, reverse]);

    return sort;
}
