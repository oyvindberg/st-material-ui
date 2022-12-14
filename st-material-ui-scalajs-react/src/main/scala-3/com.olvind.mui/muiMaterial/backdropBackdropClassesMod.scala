package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backdropBackdropClassesMod {
  
  @JSImport("@mui/material/Backdrop/backdropClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Backdrop/backdropClasses", JSImport.Default)
  @js.native
  val default: BackdropClasses = js.native
  
  inline def getBackdropUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackdropUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type BackdropClassKey = "root" | "invisible"
  
  trait BackdropClasses extends StObject {
    
    /** Styles applied to the root element if `invisible={true}`. */
    var invisible: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object BackdropClasses {
    
    inline def apply(invisible: String, root: String): BackdropClasses = {
      val __obj = js.Dynamic.literal(invisible = invisible.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackdropClasses]
    }
    
    extension [Self <: BackdropClasses](x: Self) {
      
      inline def setInvisible(value: String): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
