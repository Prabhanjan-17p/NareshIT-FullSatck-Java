import { useSort } from "../../Hooks/use-sort";
import { useFilter } from "../../Hooks/use-filter";
import { useTitleCase } from "../../Hooks/use-titilecase";

export function HooksDemoThree() {
  const data = ["banana", "apple", "cherry", "apricot"];

  const sorted = useSort(data, false);   // ascending
  const reverseSorted = useSort(data, true); // descending
  const filtered = useFilter(data, "ap");   // ["apple", "apricot"]

  const titleStr = useTitleCase("welcome to react"); // ✅ direct call with string

  return (
    <div className="container-fluid mt-3 p-3">
      <h3>Custom Hooks Demo</h3>
      <p><b>Sorted:</b> {sorted.join(", ")}</p>
      <p><b>Reverse Sorted:</b> {reverseSorted.join(", ")}</p>
      <p><b>Filtered:</b> {filtered.join(", ")}</p>
      <p><b>Title Case:</b> {titleStr}</p>
    </div>
  );
}
