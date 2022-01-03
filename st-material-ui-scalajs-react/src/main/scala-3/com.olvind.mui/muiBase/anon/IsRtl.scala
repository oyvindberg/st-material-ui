package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.muiBaseBooleans.`false`
import com.olvind.mui.muiBase.muiBaseStrings.horizontal
import com.olvind.mui.muiBase.muiBaseStrings.vertical
import com.olvind.mui.std.Record
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsRtl extends StObject {
  
  def getRootProps(): Ariaorientation = js.native
  def getRootProps(otherHandlers: Record[String, js.Function1[/* event */ Any, Unit]]): Ariaorientation = js.native
  
  var isRtl: Boolean = js.native
  
  var orientation: horizontal | vertical = js.native
  
  def processChildren(): js.UndefOr[js.Array[Element] | Null] = js.native
  
  var value: String | Double | `false` = js.native
}
