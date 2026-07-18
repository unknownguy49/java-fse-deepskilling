import "./App.css";

import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

function App(){

    const showCourse=true;
    const showBook=true;
    const showBlog=true;

    return(

        <div className="container">

            <div className="column">

                {
                    showCourse
                    ?<CourseDetails/>
                    :<h2>No Course Details</h2>
                }

            </div>

            <div className="column">

                {
                    showBook &&
                    <BookDetails/>
                }

            </div>

            <div className="column">

                {
                    showBlog
                    ?<BlogDetails/>
                    :null
                }

            </div>

        </div>

    );

}

export default App;