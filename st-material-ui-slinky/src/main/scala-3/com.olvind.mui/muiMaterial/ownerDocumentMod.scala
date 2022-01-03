package com.olvind.mui.muiMaterial

import org.scalajs.dom.Document
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ownerDocumentMod {
  
  @JSImport("@mui/material/utils/ownerDocument", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Document]
  inline def default(node: Node): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Document]
}
