package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scopedCssBaselineScopedCssBaselineClassesMod {
  
  @JSImport("@mui/joy/ScopedCssBaseline/scopedCssBaselineClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Record<'root', string> */
  object default {
    
    @JSImport("@mui/joy/ScopedCssBaseline/scopedCssBaselineClasses", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/joy/ScopedCssBaseline/scopedCssBaselineClasses", "default.root")
    @js.native
    def root: String = js.native
    inline def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  }
  
  inline def getScopedCssBaselineUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getScopedCssBaselineUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ScopedCssBaselineClassKey = "root"
  
  trait ScopedCssBaselineClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
  }
  object ScopedCssBaselineClasses {
    
    inline def apply(root: String): ScopedCssBaselineClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScopedCssBaselineClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScopedCssBaselineClasses] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
