package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.muiMaterialStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardContentClassesMod {
  
  @JSImport("@mui/material/CardContent/cardContentClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/CardContent/cardContentClasses", JSImport.Default)
  @js.native
  val default: CardContentClasses = js.native
  
  inline def getCardContentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardContentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type CardContentClassKey = root
  
  trait CardContentClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
  }
  object CardContentClasses {
    
    inline def apply(root: String): CardContentClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardContentClasses]
    }
    
    extension [Self <: CardContentClasses](x: Self) {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
