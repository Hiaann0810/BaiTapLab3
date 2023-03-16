
package lab3;
public class Triangle {
        public float width;
        public float height;
        
        public Triangle(){
            this.width=0;
            this.height=0;      
        }
        public Triangle(float width, float height){
             this.width=width;
             this.height=height;
        }
        public float getWidth(){
            return this.width;
        }
        public float getHeight(){
            return this.height;
        }
        public void setWidth(float width){
            this.width=width;
        }
        public void setHeight(float height){
            this.height=height;
        }
        public String toString(){
            return "Triangle("+width+":"+height+")";
        }
}
