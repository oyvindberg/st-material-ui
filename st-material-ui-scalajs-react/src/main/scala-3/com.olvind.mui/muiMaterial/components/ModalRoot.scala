package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ModalRoot {
  
  @JSImport("@mui/material", "ModalRoot")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ModalRoot.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.4 | undefined>['root'] */ js.Any
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
