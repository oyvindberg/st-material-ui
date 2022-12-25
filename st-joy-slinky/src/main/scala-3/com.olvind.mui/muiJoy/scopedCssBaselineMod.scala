package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsScopedCssBaselineTy
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scopedCssBaselineMod extends Shortcut {
  
  @JSImport("@mui/joy/ScopedCssBaseline", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsScopedCssBaselineTy, Element | Null] = js.native
  
  /* Inlined std.Record<'root', string> */
  object scopedCssBaselineClasses {
    
    @JSImport("@mui/joy/ScopedCssBaseline", "scopedCssBaselineClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/joy/ScopedCssBaseline", "scopedCssBaselineClasses.root")
    @js.native
    def root: String = js.native
    inline def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsScopedCssBaselineTy, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `scopedCssBaselineMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsScopedCssBaselineTy, Element | Null] = default
}
