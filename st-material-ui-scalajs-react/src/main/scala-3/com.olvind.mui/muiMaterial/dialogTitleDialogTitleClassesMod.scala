package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogTitleDialogTitleClassesMod {
  
  @JSImport("@mui/material/DialogTitle/dialogTitleClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/DialogTitle/dialogTitleClasses", JSImport.Default)
  @js.native
  val default: DialogTitleClasses = js.native
  
  inline def getDialogTitleUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialogTitleUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type DialogTitleClassKey = "root"
  
  trait DialogTitleClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
  }
  object DialogTitleClasses {
    
    inline def apply(root: String): DialogTitleClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogTitleClasses]
    }
    
    extension [Self <: DialogTitleClasses](x: Self) {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
