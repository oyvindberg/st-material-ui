package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardCardClassesMod {
  
  @JSImport("@mui/material/Card/cardClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Card/cardClasses", JSImport.Default)
  @js.native
  val default: CardClasses = js.native
  
  inline def getCardUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type CardClassKey = "root"
  
  trait CardClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
  }
  object CardClasses {
    
    inline def apply(root: String): CardClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardClasses]
    }
    
    extension [Self <: CardClasses](x: Self) {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
