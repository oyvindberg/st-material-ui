package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.muiMaterialStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFieldClassesMod {
  
  @JSImport("@mui/material/TextField/textFieldClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/TextField/textFieldClasses", JSImport.Default)
  @js.native
  val default: TextFieldClasses = js.native
  
  @scala.inline
  def getTextFieldUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextFieldUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TextFieldClassKey = root
  
  @js.native
  trait TextFieldClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object TextFieldClasses {
    
    @scala.inline
    def apply(root: String): TextFieldClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextFieldClasses]
    }
    
    @scala.inline
    implicit class TextFieldClassesMutableBuilder[Self <: TextFieldClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
