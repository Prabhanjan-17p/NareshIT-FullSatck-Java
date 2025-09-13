import { useEffect, useState } from "react";

export function useTitleCase(str) {
    const [tit, setTit] = useState("");

    useEffect(() => {
        if (str) {
            setTit(
                str
                    .toLowerCase()
                    .split(" ")
                    .map(word => word.charAt(0).toUpperCase() + word.slice(1))
                    .join(" ")
            );
        }
    }, [str]);

    return tit;
}
