package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerDividerClassesMod {
  
  @JSImport("@mui/joy/Divider/dividerClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Divider/dividerClasses", JSImport.Default)
  @js.native
  val default: DividerClasses = js.native
  
  inline def getDividerUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDividerUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type DividerClassKey = "root" | "vertical" | "insetContext" | "insetNone"
  
  trait DividerClasses extends StObject {
    
    /** Styles applied to the root element if `inset="context"`. */
    var insetContext: String
    
    /** Styles applied to the root element if `inset="none"`. */
    var insetNone: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `orientation="vertical"`. */
    var vertical: String
  }
  object DividerClasses {
    
    inline def apply(insetContext: String, insetNone: String, root: String, vertical: String): DividerClasses = {
      val __obj = js.Dynamic.literal(insetContext = insetContext.asInstanceOf[js.Any], insetNone = insetNone.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[DividerClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DividerClasses] (val x: Self) extends AnyVal {
      
      inline def setInsetContext(value: String): Self = StObject.set(x, "insetContext", value.asInstanceOf[js.Any])
      
      inline def setInsetNone(value: String): Self = StObject.set(x, "insetNone", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
