package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.muiMaterialStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardClassesMod {
  
  @JSImport("@mui/material/Card/cardClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Card/cardClasses", JSImport.Default)
  @js.native
  val default: CardClasses = js.native
  
  @scala.inline
  def getCardUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type CardClassKey = root
  
  @js.native
  trait CardClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object CardClasses {
    
    @scala.inline
    def apply(root: String): CardClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardClasses]
    }
    
    @scala.inline
    implicit class CardClassesMutableBuilder[Self <: CardClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
