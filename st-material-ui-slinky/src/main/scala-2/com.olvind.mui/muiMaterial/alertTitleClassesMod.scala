package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.muiMaterialStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertTitleClassesMod {
  
  @JSImport("@mui/material/AlertTitle/alertTitleClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/AlertTitle/alertTitleClasses", JSImport.Default)
  @js.native
  val default: AlertTitleClasses = js.native
  
  @scala.inline
  def getAlertTitleUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlertTitleUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type AlertTitleClassKey = root
  
  @js.native
  trait AlertTitleClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object AlertTitleClasses {
    
    @scala.inline
    def apply(root: String): AlertTitleClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertTitleClasses]
    }
    
    @scala.inline
    implicit class AlertTitleClassesMutableBuilder[Self <: AlertTitleClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
