package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardActionsClassesMod {
  
  @JSImport("@mui/material/CardActions/cardActionsClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/CardActions/cardActionsClasses", JSImport.Default)
  @js.native
  val default: CardActionsClasses = js.native
  
  @scala.inline
  def getCardActionsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardActionsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.spacing
  */
  trait CardActionsClassKey extends StObject
  
  @js.native
  trait CardActionsClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element unless `disableSpacing={true}`. */
    var spacing: String = js.native
  }
  object CardActionsClasses {
    
    @scala.inline
    def apply(root: String, spacing: String): CardActionsClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardActionsClasses]
    }
    
    @scala.inline
    implicit class CardActionsClassesMutableBuilder[Self <: CardActionsClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacing(value: String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    }
  }
}
