package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardActionAreaClassesMod {
  
  @JSImport("@mui/material/CardActionArea/cardActionAreaClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/CardActionArea/cardActionAreaClasses", JSImport.Default)
  @js.native
  val default: CardActionAreaClasses = js.native
  
  @scala.inline
  def getCardActionAreaUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardActionAreaUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.focusVisible
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.focusHighlight
  */
  trait CardActionAreaClassKey extends StObject
  
  @js.native
  trait CardActionAreaClasses extends StObject {
    
    /** Styles applied to the overlay that covers the action area when it is keyboard focused. */
    var focusHighlight: String = js.native
    
    /** State class applied to the ButtonBase root element if the action area is keyboard focused. */
    var focusVisible: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object CardActionAreaClasses {
    
    @scala.inline
    def apply(focusHighlight: String, focusVisible: String, root: String): CardActionAreaClasses = {
      val __obj = js.Dynamic.literal(focusHighlight = focusHighlight.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardActionAreaClasses]
    }
    
    @scala.inline
    implicit class CardActionAreaClassesMutableBuilder[Self <: CardActionAreaClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusHighlight(value: String): Self = StObject.set(x, "focusHighlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
