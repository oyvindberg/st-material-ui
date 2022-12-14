package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardActionAreaCardActionAreaClassesMod {
  
  @JSImport("@mui/material/CardActionArea/cardActionAreaClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/CardActionArea/cardActionAreaClasses", JSImport.Default)
  @js.native
  val default: CardActionAreaClasses = js.native
  
  inline def getCardActionAreaUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardActionAreaUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type CardActionAreaClassKey = "root" | "focusVisible" | "focusHighlight"
  
  trait CardActionAreaClasses extends StObject {
    
    /** Styles applied to the overlay that covers the action area when it is keyboard focused. */
    var focusHighlight: String
    
    /** State class applied to the ButtonBase root element if the action area is keyboard focused. */
    var focusVisible: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object CardActionAreaClasses {
    
    inline def apply(focusHighlight: String, focusVisible: String, root: String): CardActionAreaClasses = {
      val __obj = js.Dynamic.literal(focusHighlight = focusHighlight.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardActionAreaClasses]
    }
    
    extension [Self <: CardActionAreaClasses](x: Self) {
      
      inline def setFocusHighlight(value: String): Self = StObject.set(x, "focusHighlight", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
