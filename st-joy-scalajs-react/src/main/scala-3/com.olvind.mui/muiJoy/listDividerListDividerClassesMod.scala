package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listDividerListDividerClassesMod {
  
  @JSImport("@mui/joy/ListDivider/listDividerClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/ListDivider/listDividerClasses", JSImport.Default)
  @js.native
  val default: ListDividerClasses = js.native
  
  inline def getListDividerUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListDividerUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ListDividerClassKey = "root" | "insetGutter" | "insetStartDecorator" | "insetStartContent"
  
  trait ListDividerClasses extends StObject {
    
    /** Styles applied to the root element if `inset="gutter"`. */
    var insetGutter: String
    
    /** Styles applied to the root element if `inset="startContent"`. */
    var insetStartContent: String
    
    /** Styles applied to the root element if `inset="startDecorator"`. */
    var insetStartDecorator: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object ListDividerClasses {
    
    inline def apply(insetGutter: String, insetStartContent: String, insetStartDecorator: String, root: String): ListDividerClasses = {
      val __obj = js.Dynamic.literal(insetGutter = insetGutter.asInstanceOf[js.Any], insetStartContent = insetStartContent.asInstanceOf[js.Any], insetStartDecorator = insetStartDecorator.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListDividerClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListDividerClasses] (val x: Self) extends AnyVal {
      
      inline def setInsetGutter(value: String): Self = StObject.set(x, "insetGutter", value.asInstanceOf[js.Any])
      
      inline def setInsetStartContent(value: String): Self = StObject.set(x, "insetStartContent", value.asInstanceOf[js.Any])
      
      inline def setInsetStartDecorator(value: String): Self = StObject.set(x, "insetStartDecorator", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
