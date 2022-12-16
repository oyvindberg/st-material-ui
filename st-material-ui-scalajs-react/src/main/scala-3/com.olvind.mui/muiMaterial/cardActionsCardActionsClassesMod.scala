package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardActionsCardActionsClassesMod {
  
  @JSImport("@mui/material/CardActions/cardActionsClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/CardActions/cardActionsClasses", JSImport.Default)
  @js.native
  val default: CardActionsClasses = js.native
  
  inline def getCardActionsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardActionsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type CardActionsClassKey = "root" | "spacing"
  
  trait CardActionsClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element unless `disableSpacing={true}`. */
    var spacing: String
  }
  object CardActionsClasses {
    
    inline def apply(root: String, spacing: String): CardActionsClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardActionsClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardActionsClasses] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSpacing(value: String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    }
  }
}
