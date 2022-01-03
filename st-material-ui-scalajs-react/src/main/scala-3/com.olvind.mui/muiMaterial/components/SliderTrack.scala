package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SliderTrack {
  
  @JSImport("@mui/material", "SliderTrack")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SliderTrack.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.MarkLabel | undefined>['track'] */ js.Any
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
