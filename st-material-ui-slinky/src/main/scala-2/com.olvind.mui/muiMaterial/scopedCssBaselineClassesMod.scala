package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.muiMaterialStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scopedCssBaselineClassesMod {
  
  @JSImport("@mui/material/ScopedCssBaseline/scopedCssBaselineClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Record<'root', string> */
  object default {
    
    @JSImport("@mui/material/ScopedCssBaseline/scopedCssBaselineClasses", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/material/ScopedCssBaseline/scopedCssBaselineClasses", "default.root")
    @js.native
    def root: String = js.native
    @scala.inline
    def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def getScopedCssBaselineUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getScopedCssBaselineUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ScopedCssBaselineClassKey = root
  
  @js.native
  trait ScopedCssBaselineClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object ScopedCssBaselineClasses {
    
    @scala.inline
    def apply(root: String): ScopedCssBaselineClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScopedCssBaselineClasses]
    }
    
    @scala.inline
    implicit class ScopedCssBaselineClassesMutableBuilder[Self <: ScopedCssBaselineClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
