package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.muiMaterialStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogTitleClassesMod {
  
  @JSImport("@mui/material/DialogTitle/dialogTitleClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/DialogTitle/dialogTitleClasses", JSImport.Default)
  @js.native
  val default: DialogTitleClasses = js.native
  
  @scala.inline
  def getDialogTitleUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialogTitleUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type DialogTitleClassKey = root
  
  @js.native
  trait DialogTitleClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object DialogTitleClasses {
    
    @scala.inline
    def apply(root: String): DialogTitleClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogTitleClasses]
    }
    
    @scala.inline
    implicit class DialogTitleClassesMutableBuilder[Self <: DialogTitleClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
