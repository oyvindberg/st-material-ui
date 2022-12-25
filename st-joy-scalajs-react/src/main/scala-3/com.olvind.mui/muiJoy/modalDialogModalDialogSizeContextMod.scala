package com.olvind.mui.muiJoy

import com.olvind.mui.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalDialogModalDialogSizeContextMod extends Shortcut {
  
  @JSImport("@mui/joy/ModalDialog/ModalDialogSizeContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr["sm" | "md" | "lg"]] = js.native
  
  type _To = Context[js.UndefOr["sm" | "md" | "lg"]]
  
  /* This means you don't have to write `default`, but can instead just say `modalDialogModalDialogSizeContextMod.foo` */
  override def _to: Context[js.UndefOr["sm" | "md" | "lg"]] = default
}
