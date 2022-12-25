package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardContentCardContentClassesMod {
  
  @JSImport("@mui/joy/CardContent/cardContentClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/CardContent/cardContentClasses", JSImport.Default)
  @js.native
  val default: CardContentClasses = js.native
  
  inline def getCardContentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardContentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type CardContentClassKey = "root"
  
  trait CardContentClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
  }
  object CardContentClasses {
    
    inline def apply(root: String): CardContentClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardContentClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardContentClasses] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
