package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.muiMaterialStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogContentTextClassesMod {
  
  @JSImport("@mui/material/DialogContentText/dialogContentTextClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/DialogContentText/dialogContentTextClasses", JSImport.Default)
  @js.native
  val default: DialogContentTextClasses = js.native
  
  @scala.inline
  def getDialogContentTextUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialogContentTextUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type DialogContentTextClassKey = root
  
  @js.native
  trait DialogContentTextClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object DialogContentTextClasses {
    
    @scala.inline
    def apply(root: String): DialogContentTextClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogContentTextClasses]
    }
    
    @scala.inline
    implicit class DialogContentTextClassesMutableBuilder[Self <: DialogContentTextClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
