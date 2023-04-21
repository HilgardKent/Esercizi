import { useState } from "react";
const Icon = (props) => {
    
    const [icon,setIcon]=useState(props.icon);

    return (
        <div className="flex justify-center items-center w-10 h-10 m-5 cursor-pointer">
            <span className="cursor-pointer">
                {icon}
            </span>
        </div>
    );
}
export default Icon;