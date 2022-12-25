package com.olvind.mui.muiJoy

import com.olvind.mui.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsSizeTabsContextMod extends Shortcut {
  
  @JSImport("@mui/joy/Tabs/SizeTabsContext", JSImport.Default)
  @js.native
  val default: Context["sm" | "md" | "lg"] = js.native
  
  type _To = Context["sm" | "md" | "lg"]
  
  /* This means you don't have to write `default`, but can instead just say `tabsSizeTabsContextMod.foo` */
  override def _to: Context["sm" | "md" | "lg"] = default
}
